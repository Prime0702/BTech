class Node:
    def __init__(self, char, freq, left=None, right=None):
        self.char = char
        self.freq = freq
        self.left = left
        self.right = right

    def __lt__(self, other):
        return self.freq < other.freq

class LinkedListNode:
    def __init__(self, node):
        self.node = node
        self.next = None

def build_huffman_tree(S, f):
    linked_list = None
    for i in range(len(S)):
        node = Node(S[i], f[i])
        linked_list = insert_into_linked_list(linked_list, node)

    while linked_list.next is not None:
        first = linked_list.node
        second = linked_list.next.node
        freq_sum = first.freq + second.freq
        merged = Node(None, freq_sum, first, second)
        linked_list = linked_list.next.next
        linked_list = insert_into_linked_list(linked_list, merged)

    return linked_list.node

def insert_into_linked_list(linked_list, node):
    new_node = LinkedListNode(node)
    if linked_list is None:
        return new_node

    if node.freq < linked_list.node.freq:
        new_node.next = linked_list
        return new_node

    current = linked_list
    while current.next is not None and node.freq >= current.next.node.freq:
        current = current.next

    new_node.next = current.next
    current.next = new_node
    return linked_list

def print_huffman_codes(node, code=""):
    if node.char is not None:
        print(node.char, code)
        return

    print_huffman_codes(node.left, code + "0")
    print_huffman_codes(node.right, code + "1")

S = ['a', 'b', 'c', 'd', 'e']
f = [5, 9, 12, 13, 16]

root = build_huffman_tree(S, f)
print_huffman_codes(root)

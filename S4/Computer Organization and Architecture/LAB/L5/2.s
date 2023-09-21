.data
    MSG1: .asciiz "Y: "
    MSG2: .asciiz "K: "
    MSG3: .asciiz "Z: "
    newline: .asciiz "\n"
.text
main:
    li $t1, 60 # y=60
    li $t2, 20 # k=20
    srl $t0, $t2, 2 # k/4
    addi $t0, $t0, 210 # k/4+210
    sll $t0, $t0, 4 # (k/4+210)*16
    sub	$t0, $t1, $t0 # y-(k/4+210)*16
    li $v0, 4
    la $a0, MSG1
    syscall
    li $v0, 1
    move $a0, $t1
    syscall
    li $v0, 4
    la $a0, newline
    syscall
    li $v0, 4
    la $a0, MSG2
    syscall
    li $v0, 1
    move $a0, $t2
    syscall
    li $v0, 4
    la $a0, newline
    syscall
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 1
    move $a0, $t0
    syscall
    li $v0, 4
    la $a0, newline
    syscall
    jr $ra

    
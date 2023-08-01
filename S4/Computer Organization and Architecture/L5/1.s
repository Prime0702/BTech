.data
MSG1: .asciiz "Enter number 1: "
MSG2: .asciiz "Enter number 2: "
MSG3: .asciiz "Number 1 "
MSG4: .asciiz "Number 2 "
MSG5: .asciiz "is divisible by "
MSG6: .asciiz "is not divisible by "
MSG7: .asciiz "\n"
.text
main:
    li $v0, 4
    la $a0, MSG1
    syscall
    li $v0, 5
    syscall
    move $t0, $v0
    li $v0, 4
    la $a0, MSG2
    syscall
    li $v0, 5
    syscall
    move $t1, $v0
    div $t0, $t1
    mfhi $t2
    beq $t2, 0, abc
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 4
    la $a0, MSG6
    syscall
    li $v0, 4
    la $a0, MSG4
    syscall
    li $v0, 4
    la $a0, MSG7
    syscall
    j next
abc:
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 4
    la $a0, MSG5
    syscall
    li $v0, 4
    la $a0, MSG4
    syscall
    li $v0, 4
    la $a0, MSG7
    syscall
    j exit
next:
    div $t1, $t0
    mfhi $t2
    beq $t2, 0, def
    li $v0, 4
    la $a0, MSG4
    syscall
    li $v0, 4
    la $a0, MSG6
    syscall
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 4
    la $a0, MSG7
    syscall
    j exit
def:
    li $v0, 4
    la $a0, MSG4
    syscall
    li $v0, 4
    la $a0, MSG5
    syscall
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 4
    la $a0, MSG7
    syscall
    j exit
exit:
    jr $ra
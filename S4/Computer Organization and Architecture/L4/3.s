.data
    MSG1: .asciiz "Enter a number: "
    MSG2: .asciiz "The logical not of the number is: "
.text
main:
    li $v0, 4
    la $a0, MSG1
    syscall

    li $v0, 5
    syscall
    move $t0, $v0

    not $t1, $t0

    li $v0, 4
    la $a0, MSG2
    syscall

    li $v0, 1
    move $a0, $t1
    syscall

    jr $ra
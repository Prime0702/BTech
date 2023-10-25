.data
    MSG1: .asciiz "Enter number 1: "
    MSG2: .asciiz "Enter number 2: "
    MSG3: .asciiz "Quotient: "
    MSG4: .asciiz "\nRemainder: "
.text
    main:
    li $v0, 4
    la $a0, MSG1
    syscall
    li $v0, 5
    syscall
    move $t0, $v0 # $t0 = num1
    li $v0, 4
    la $a0, MSG2
    syscall
    li $v0, 5
    syscall
    move $t1, $v0 # $t1 = num2
    div $t0, $t1
    mflo $t2 # $t2 = quotient
    mfhi $t3 # $t3 = remainder
    li $v0, 4
    la $a0, MSG3
    syscall
    li $v0, 1
    move $a0, $t2
    syscall
    li $v0, 4
    la $a0, MSG4
    syscall
    li $v0, 1
    move $a0, $t3
    syscall
    jr $ra
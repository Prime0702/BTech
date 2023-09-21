.data
    MSG1: .asciiz "Enter Number 1: "
    MSG2: .asciiz "Enter Number 2: "
    MSG3: .asciiz "Product is: "
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
    mul $t2, $t0, $t1
    li $v0, 4
    la $a0, MSG3
    syscall
    move $a0, $t2
    li $v0, 1
    syscall
    jr $ra
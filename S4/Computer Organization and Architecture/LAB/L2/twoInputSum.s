.data
    MSG1: .asciiz "The result is: "
    MSG2: .asciiz "Enter the numbers: "
.text
    main:
        li $v0, 4
        la $a0, MSG2
        syscall
        li $v0, 5
        syscall
        move $t3, $v0
        li $v0, 5
        syscall
        move $t2, $v0
        add $t1, $t3, $t2
        li $v0, 4
        la $a0, MSG1
        syscall
        li $v0, 1
        move $a0, $t1
        syscall
        jr $ra
        
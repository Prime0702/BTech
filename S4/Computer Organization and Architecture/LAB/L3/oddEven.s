.data
    MSG1: .asciiz "Enter the number: "
    MSG2: .asciiz "The number is odd"
    MSG3: .asciiz "The number is even"
.text
    main:
        li $v0, 4
        la $a0, MSG1
        syscall
        
        li $v0, 5
        syscall
        move $t0, $v0
        
        li $t1, 1
        and $t2, $t0, $t1
        bne $t2, $0, odd
        
        li $v0, 4
        la $a0, MSG3
        syscall
        
        j end
    odd:
        li $v0, 4
        la $a0, MSG2
        syscall
    end:
        jr $ra
        
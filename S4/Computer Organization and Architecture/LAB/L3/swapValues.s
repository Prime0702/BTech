.data   
    MSG1: .asciiz "Enter number 1: "
    MSG2: .asciiz "Enter number 2: "
    MSG3: .asciiz "Number 1: "
    MSG4: .asciiz "Number 2: "
    MSG5: .asciiz "Swaped number 1: "
    MSG6: .asciiz "Swaped number 2: "
.text
    main:
        li $v0, 4
        la $a0, MSG1
        syscall
        
        li $v0, 5
        syscall
        move $s0, $v0
        
        li $v0, 4
        la $a0, MSG2
        syscall
        
        li $v0, 5
        syscall
        move $s1, $v0
        
        li $v0, 4
        la $a0, MSG3
        syscall
        
        move $a0, $s0
        li $v0, 1
        syscall
        
        li $v0, 4
        la $a0, MSG4
        syscall
        
        move $a0, $s1
        li $v0, 1
        syscall
        
        move $t0, $s0
        move $s0, $s1
        move $s1, $t0
        
        li $v0, 4
        la $a0, MSG5
        syscall
        
        move $a0, $s0
        li $v0, 1
        syscall
        
        li $v0, 4
        la $a0, MSG6
        syscall
        
        move $a0, $s1
        li $v0, 1
        syscall
        
        jr $ra

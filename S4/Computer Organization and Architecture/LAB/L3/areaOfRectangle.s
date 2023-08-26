.data
    MSG1: .asciiz "Enter Width: "
    MSG2: .asciiz "Enter Height: "
    MSG3: .asciiz "Area: "
.text
    main:
        li $v0, 4
        la $a0, MSG1
        syscall
        
        li $v0, 5
        syscall
        move $s0, $v0 #width at $s0
        
        li $v0, 4
        la $a0, MSG2
        syscall
        
        li $v0, 5
        syscall
        move $s1, $v0 #height at $s1
        
        mul $s2, $s0, $s1
        
        li $v0, 4
        la $a0, MSG3
        syscall
        
        move $a0, $s2
        li $v0, 1
        syscall
        
        jr $ra
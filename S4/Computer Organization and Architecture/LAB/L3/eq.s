.data
    MSG1: .asciiz "Enter value of x: "
    MSG2: .asciiz "Enter value of y: "
    MSG3: .asciiz "Enter value of z: "
    MSG4: .asciiz "4x^2 + 2x +3 = "
    MSG5: .asciiz "\n5x +3y +z = " 
    MSG6: .asciiz "\n((5x+3y+z)/2)*3 = "
    MSG7: .asciiz "\n(4x/3)*y = "
.text
    main:
    li $v0, 4
    la $a0, MSG1
    syscall
    
    li $v0, 5
    syscall
    move $s0, $v0 #x = $s0
    
    li $v0, 4
    la $a0, MSG2
    syscall
    
    li $v0, 5
    syscall
    move $s1, $v0 #y = $s1
    
    li $v0, 4
    la $a0, MSG3
    syscall
    
    li $v0, 5
    syscall
    move $s2, $v0 #z = $s2
    
    mul $t0, $s0, $s0 #x^2
    mul $t0, $t0, $s0 #4x^2
    add $t1, $s0, $s0 #2x
    add $t0, $t0, $t1 #4x^2 + 2x
    addi $t0, $t0, 3 #4x^2 + 2x +3
    
    li $v0, 4
    la $a0, MSG4
    syscall
    
    li $v0, 1
    move $a0, $t0
    syscall
    
    li $v0, 4
    la $a0, MSG5
    syscall
    
    li $t7, 5
    mul $t0, $s0, $t7 #5x
    li $t7, 3
    mul $t1, $s1, $t7 #3y
    add $t0, $t0, $t1 #5x +3y
    add $t0, $t0, $s2 #5x +3y +z
    
    li $v0, 1
    move $a0, $t0
    syscall
    
    li $v0, 4
    la $a0, MSG6
    syscall
    
    li $t7, 5
    mul $t0, $s0, $t7 #5x
    li $t7, 3
    mul $t1, $s1, $t7 #3y
    add $t0, $t0, $t1 #5x +3y
    add $t0, $t0, $s2 #5x +3y +z
    div $t0, $t0, 2 #((5x+3y+z)/2)
    li $t7, 3
    mul $t0, $t0, $t7 #((5x+3y+z)/2)*3
    
    li $v0, 1
    move $a0, $t0
    syscall
    
    li $v0, 4
    la $a0, MSG7
    syscall

    li $t7, 4
    mul $t0, $s0, $t7 #4x
    div $t0, $t0, 3 #(4x/3)
    mul $t0, $t0, $s1 #(4x/3)*y

    li $v0, 1
    move $a0, $t0
    syscall

    jr $ra
.data
    MSG1: .asciiz "Enter x: "
    MSG2: .asciiz "Enter y: "
    MSG3: .asciiz "Enter z: "
    MSG4: .asciiz "Enter q: "
    MSG5: .asciiz "x\ty\tz\tq\n"
    MSG6: .asciiz "$s1\t$s2\t$s3\t$s4\n"
    MSG7: .asciiz "\t"
    MSG8: .asciiz "\n"
    MSG9: .asciiz "Before execution\n"
    MSG10: .asciiz "After execution\n"
.text
main:
    li $v0,4
    la $a0,MSG1
    syscall
    li $v0,5
    syscall
    move $s1,$v0
    li $v0,4
    la $a0,MSG2
    syscall
    li $v0,5
    syscall
    move $s2,$v0
    li $v0,4
    la $a0,MSG3
    syscall
    li $v0,5
    syscall
    move $s3,$v0
    li $v0,4
    la $a0,MSG4
    syscall
    li $v0,5
    syscall
    move $s4,$v0
    li $v0,4
    la $a0,MSG9
    syscall
    li $v0,4
    la $a0,MSG5
    syscall
    li $v0,4
    la $a0,MSG6
    syscall
    move $a0,$s1
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s2
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s3
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s4
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG8
    syscall
    addi $t0,$s1,0
    add $t0,$t0,$s2
    add $t0,$t0,$s3
    sub $t0,$t0,$s4
    move $s1,$t0
    li $v0,4
    la $a0,MSG10
    syscall
    li $v0,4
    la $a0,MSG5
    syscall
    li $v0,4
    la $a0,MSG6
    syscall
    move $a0,$s1
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s2
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s3
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG7
    syscall
    move $a0,$s4
    li $v0,1
    syscall
    li $v0,4
    la $a0,MSG8
    syscall
    jr $ra
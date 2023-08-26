.data
MSG1 : .asciiz "enter integer : "
MSG2 : .asciiz "binary representation of given integer :"
MSG3 : .asciiz "\n"
.text 
main:
    li $v0,4
    la $a0,MSG1
    syscall
    li $v0,5
    syscall
    move $t0,$v0
    beq $t0,0,exit
    li $v0,4
    la $a0,MSG2
    syscall

    li $t2,0
    li $t3,8
    li $t4,1
    li $t5,0

loop:
    beq $t2,$t3,exit_loop
    and $t1,$t0,128
    beq $t1,0,zero
    bne $t1,128,one
    

one:
    li $v0,1
    move $a0,$t4
    syscall
    sll $t0,$t0,1
    addi $t2,$t2,1
    j loop

zero:
    li $v0,1
    move $a0,$t5
    syscall
    sll $t0,$t0,1
    addi $t2,$t2,1
    j loop

exit_loop:
    li $v0,4
    la $a0,MSG3
    syscall
    j main
exit:
    li $v0,10
    syscall
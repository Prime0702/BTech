.data
    MSG1: .asciiz "Enter number: "
    MSG2: .asciiz "Factorial: "
.text
    main:
        li $v0, 4
        la $a0, MSG1
        syscall 
        li $v0, 5
        syscall # read number
        move $t1, $v0 # save number in $t1
        li $t2, 1 # initialize factorial to 1
    loop:
        beq $t1, $zero, end # if number is 0, end loop
        mul $t2, $t2, $t1 # multiply factorial by number
        sub $t1, $t1, 1 # decrement number
        j loop # loop
    end:
        li $v0, 4
        la $a0, MSG2
        syscall 
        move $a0, $t2 # move factorial to $a0
        li $v0, 1
        syscall # print factorial
        jr $ra


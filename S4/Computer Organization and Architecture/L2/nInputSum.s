.data 
    msg1:	.asciiz	"\nNumber of integers (N)?  " 
    msg2:	.asciiz	"\nSum  =   " 
    lf:     .asciiz	"\n" 

.text 
    main: 
        li $v0,4		# output msg1 
        la $a0, msg1 
        syscall 
        li $v0,5		# input N and save 
        syscall	 
        move $t0,$v0 
        li $t1, 0		# initialize counter (i) 
        li $t2, 0		# initialize sum 
    loop:	
        addi $t1, $t1, 1	# i = i + 1 
        add	$t2, $t2, $t1	# sum = sum + i b 
        beq	$t0, $t1, exit	# if i = N, continue 
        j loop 
    exit:	
        li $v0, 4		# output msg2 
        la $a0, msg2 
        syscall 
        li $v0,1		# output sum 
        move $a0, $t2 
        syscall 
        li $v0,4		# output lf 
        la $a0, lf 
        syscall 
        li $v0,10		# exit 
        syscall 
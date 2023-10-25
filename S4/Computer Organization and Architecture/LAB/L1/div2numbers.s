.data
    MSG1: .asciiz " The numbers 5 and 6 are divided together : " 
.text
    main: 
        li $t1,5
        li $t2,6
        div		$t1, $t2			# $t1 / $t2
        mflo	$t2					# $t2 = floor($t1 / $t2) 
        mfhi	$t3					# $t3 = $t1 % $t2 
        li $v0, 4
        la $a0, MSG1
        syscall
        li $v0, 1
        move $a0, $t2
        syscall
        jr $ra
        

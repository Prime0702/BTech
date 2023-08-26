.data
	MSG1: .asciiz "Enter Number 1 : "
	MSG2: .asciiz "Enter Number 2 : "
	MSG3: .asciiz "The Result of Left Shift Operation is : "
.text
	main:
		addi $v0,$0,4
		la $a0,MSG1
		syscall

		addi $v0,$0,5
		syscall
		add $8,$0,$v0

		addi $v0,$0,4
		la $a0,MSG2
		syscall

		addi $v0,$0,5
		syscall
		add $9,$0,$v0

		add $8,$8,$9
		sll $9,$8,2

		addi $v0,$0,4
		la $a0,MSG3
		syscall

		addi $v0,$0,1
		add $a0,$0,$9
		syscall	

	    jr $ra
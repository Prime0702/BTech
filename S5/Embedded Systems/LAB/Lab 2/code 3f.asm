;Division of 2 numbers : Dividend -> 4AH & Divisor -> 08H
	LDA 2050H  ; Load Divisor in Accumulator
	MOV B,A     ; Copy Divisor to Register B
	LDA 2051H  ; Load Dividend in Accumulator
	MVI C, 00H  ; Initialize register C for Quotient
Next: CMP B          ; Compare the no. in B with the no. in Accumulator
	JC Loop         ; Jump if B>A to Loop
	INR C            ; Increment Register C (Quotient)
	SUB B           ; Subtract B from A
	JMP Next      ; Repeat the above steps till A becomes smaller than B
Loop: STA 2052H  ; Store the remainder at memory address 2052
	MOV A,C      ; Move the contents of C to Accumulator
	STA 2053H   ; Store the Quotient at memory address 2053
	HLT               ; HLT
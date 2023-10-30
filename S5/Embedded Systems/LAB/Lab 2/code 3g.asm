;Addition of 2 numbers 1020H & 2040H
LHLD 8501H    ; Get first 16-bit number in HL 
XCHG               ; Save first 16-bit number in DE
LHLD 8503H    ; Get second 16-bit number in HL
MOV A,E          ; Get lower byte of the first number
ADD L               ; Add lower byte of the second number
MOV L,A          ; Store the result in L register
MOV A,D          ; Get higher byte of the first number
ADD H               ; Add higher byte of second number with borrow
MOV H,A          ; Store the result in H register
SHLD 8505H     ; Store l6-bit result in memory locations
HLT                    ; Terminate program
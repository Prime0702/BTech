LDA 5100H ; Load Address Of Number In H-L Register Pair (Lower byte data).
CMA             ; Complement Accumulator
INR A            ; Increment 
STA 5101H  ; Store The Result   
HLT               ; Terminate Program
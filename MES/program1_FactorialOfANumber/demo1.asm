	AREA FACT, CODE, READONLY
ENTRY
	MOV R0, #4  ; TELLS UPTO WHICH VALUE WE NEED TO CALCULATE THE FACTORIAL
	MOV R1, #1  ; HOLDS THE RESULT
LOOP
	MUL R2, R0, R1
	MOV R1, R2
	SUBS R0, R0, #1
	BNE LOOP
STOP B STOP
	END
	AREA SUMOF10, CODE, READONLY
ENTRY
	MOV R0, #10
	MOV R1, #0
LOOP
	ADD R1, R0, R1
	SUBS R0, R0, #1
	BNE LOOP
STOP B STOP
	END
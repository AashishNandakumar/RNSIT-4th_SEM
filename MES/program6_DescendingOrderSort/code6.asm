	AREA DESENDING_ORDER_SORT, CODE, READONLY
ENTRY
	MOV R0, #5
OUTLOOP
	MOV R1, R0
	LDR R2, =0X40000000
INLOOP
	LDR R3, [R2], #4
	LDR R4, [R2]
	CMP R4, R3
	BCC SKIP
	STR R3, [R2], #-4
	STR R4, [R2], #4
SKIP
	SUBS R1, R1, #1
	BNE INLOOP
	SUBS R0, R0, #1
	BNE OUTLOOP
STOP B STOP
	END
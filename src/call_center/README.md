# Call Center    
Imagine you have a call center with three levels of employees: respondent,
manager and director. An incoming telephone call must be first allocated to a
respondent who is free. If the respondent can't handle the call, he or she must
escalate the call to a manager. If the manager is not free or not able to handle it,
then the call should be escalated to a director. Design the classes and data
structures for this problem. Implement a method dispatchCaLL() which assigns a
call to the first available employee

  
# Output    

Got new call 0  
0 Assigned to R0  
R0 Received call 0  
  
Got new call 1  
1 Assigned to R1  
R1 Received call 1  
  
Got new call 2  
2 Assigned to R2  
R2 Received call 2  
  
Got new call 3  
3 Assigned to R3  
R3 Received call 3  
  
Got new call 4  
4 Assigned to R4  
R4 Received call 4  
  
Got new call 5  
5 Assigned to R5  
R5 Received call 5  
  
Got new call 6  
6 Assigned to R6  
R6 Received call 6  
  
Got new call 7  
7 Assigned to R7  
R7 Received call 7  
  
Got new call 8  
8 Assigned to R8  
R8 Received call 8  
  
Got new call 9  
9 Assigned to R9  
R9 Received call 9  
  
Got new call 10  
Please wait for free employee to reply - 10  
  
Got new call 11  
Please wait for free employee to reply - 11  
  
Got new call 12  
Please wait for free employee to reply - 12  
  
Got new call 13  
Please wait for free employee to reply - 13  
  
Got new call 14  
Please wait for free employee to reply - 14  
  
Got new call 15  
Please wait for free employee to reply - 15  
  
Got new call 16  
Please wait for free employee to reply - 16  
  
Got new call 17  
Please wait for free employee to reply - 17  
  
Caller 0 Wants to disconnect the call.... Disconnecting  
R0 disconnected call 0  
R0 is free, Assign new call if available  
  
  
Available calls 8  0  0  
10 Assigned to R0  
R0 Received call 10  
  
Caller 0 Wants to disconnect the call.... Call already disconnected  
  
Caller 15 Wants to disconnect the call.... Disconnecting  
Disconnected waiting call 15  
R0 disconnected call 10  
R0 is free, Assign new call if available  
  
  
Available calls 6  0  0  
11 Assigned to R0  
R0 Received call 11  
R1 disconnected call 1  
R1 is free, Assign new call if available  
  
  
Available calls 5  0  0  
12 Assigned to R1  
R1 Received call 12  
R2 disconnected call 2  
R2 is free, Assign new call if available  
  
  
Available calls 4  0  0  
13 Assigned to R2  
R2 Received call 13  
R3 Escalated call 3  
3 Assigned to M0  
M0 Received call 3  
R4 Escalated call 4  
R6 Escalated call 6  
R5 disconnected call 5  
R5 is free, Assign new call if available  
  
4 Assigned to M1  
M1 Received call 4  
R7 Escalated call 7  
R4 is free, Assign new call if available  
  
R3 is free, Assign new call if available  
  
R9 disconnected call 9  
R9 is free, Assign new call if available  
  
R8 Escalated call 8  
7 Assigned to M2  
M2 Received call 7  
R0 disconnected call 11  
R0 is free, Assign new call if available  
  
R7 is free, Assign new call if available  
  
  
Available calls 3  0  0  
14 Assigned to R5  
R5 Received call 14  
Please wait for free employee to reply - 6  
R6 is free, Assign new call if available  
  
  
Available calls 2  1  0  
16 Assigned to R7  
R7 Received call 16  
  
Available calls 1  1  0  
17 Assigned to R0  
R0 Received call 17  
Please wait for free employee to reply - 8  
R8 is free, Assign new call if available  
  
  
Available calls 0  2  0  
Calls not available for Responder  
  
Available calls 0  2  0  
Calls not available for Responder  
  
Available calls 0  2  0  
Calls not available for Responder  
  
Available calls 0  2  0  
Calls not available for Responder  
  
Available calls 0  2  0  
Calls not available for Responder  
R0 disconnected call 17  
R0 is free, Assign new call if available  
  
  
Available calls 0  2  0  
Calls not available for Responder  
R1 disconnected call 12  
R1 is free, Assign new call if available  
  
  
Available calls 0  2  0  
Calls not available for Responder  
R2 Escalated call 13  
Please wait for free employee to reply - 13  
R2 is free, Assign new call if available  
  
  
Available calls 0  3  0  
Calls not available for Responder  
M0 disconnected call 3  
M0 is free, Assign new call if available  
  
  
Available calls 0  3  0  
6 Assigned to M0  
M0 Received call 6  
M1 disconnected call 4  
M1 is free, Assign new call if available  
  
  
Available calls 0  2  0  
8 Assigned to M1  
M1 Received call 8  
M2 disconnected call 7  
M2 is free, Assign new call if available  
  
  
Available calls 0  1  0  
13 Assigned to M2  
M2 Received call 13  
R5 Escalated call 14  
Please wait for free employee to reply - 14  
R5 is free, Assign new call if available  
  
  
Available calls 0  1  0  
Calls not available for Responder  
R7 disconnected call 16  
R7 is free, Assign new call if available  
  
  
Available calls 0  1  0  
Calls not available for Responder  
M0 Escalated call 6  
6 Assigned to D0  
D0 Received call 6  
M0 is free, Assign new call if available  
  
  
Available calls 0  1  0  
14 Assigned to M0  
M0 Received call 14  
M1 disconnected call 8  
M1 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Manager  
M2 disconnected call 13  
M2 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Manager  
D0 disconnected call 6  
D0 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
M0 Escalated call 14  
14 Assigned to D0  
D0 Received call 14  
M0 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Manager  
D0 Escalated call 14  
14 Assigned to D1  
D1 Received call 14  
D0 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
D1 Escalated call 14  
14 Assigned to D0  
D0 Received call 14  
D1 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
D0 Escalated call 14  
14 Assigned to D1  
D1 Received call 14  
D0 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
D1 Escalated call 14  
14 Assigned to D0  
D0 Received call 14  
D1 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
D0 Escalated call 14  
14 Assigned to D1  
D1 Received call 14  
D0 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
D1 disconnected call 14  
D1 is free, Assign new call if available  
  
  
Available calls 0  0  0  
Calls not available for Director  
      
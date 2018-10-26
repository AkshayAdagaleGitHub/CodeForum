# CodeForum
Random Problems from CodeForum

Vova And Train

Vova plans to go to the conference by train. Initially, the train is at the point 1 and the destination point of the path is the point 
L. The speed of the train is 1 length unit per minute (i.e. at the first minute the train is at the point 1, at the second minute — at the point 2 and so on).

There are lanterns on the path. They are placed at the points with coordinates divisible by v (i.e. the first lantern is at the point 
v, the second is at the point 2v and so on).

There is also exactly one standing train which occupies all the points from l to r inclusive.

Vova can see the lantern at the point p if p is divisible by v and there is no standing train at this position (
p∉[l;r]). Thus, if the point with the lantern is one of the points covered by the standing train, Vova can't see this lantern.

Your problem is to say the number of lanterns Vova will see during the path. Vova plans to go to t different conferences, so you should answer t independent queries.

Input
The first line of the input contains one integer 
t (1≤t≤10^4) — the number of queries.

Then t lines follow. The i-th line contains four integers Li,vi,li,ri (1≤L,v≤10^9,1≤l≤r≤L) — destination point of the i-th path, the period of the lantern appearance and the segment occupied by the standing train.

Output
Print t lines. The i-th line should contain one integer — the answer for the i-th query.

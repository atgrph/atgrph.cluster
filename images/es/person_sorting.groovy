//def vals

int b = doc['boost'].value
int verify = doc['verified'].value

int autographCount =doc['autographSent'].value
followerCount = doc['followersCount'].value

// calcs
vW= weights.vW
v = autographCount > 0 ? vW * verify : 0;
aWV = weights.aWV
aW = weights.aW
a = autographCount *(verify ? aWV : aW);


fKMax = weights.fKMax // 100
fKMin = weights.fKMin // 10
fK = autographCount > 0 ? fKMax : fKMin;

f = (followerCount / fMAX) * fK

// main formula

b + _score + v + a + f




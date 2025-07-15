class Solution {
public:
    double findMedianSortedArrays(vector<int>& v1, vector<int>& v2) {

       vector<int> v(v1.size() + v2.size());
    // Merging the two vectors
    merge(v1.begin(), v1.end(), v2.begin(),
          v2.end(), v.begin());
          sort(v.begin(),v.end());

        int sz=v.size();
        double ans;
        if(sz&1)
        {
            int cal=((sz+1)/2)-1;
            ans=v[cal];
        }
        else
        {
            int cal=(sz)/2;
            int cal2=cal-1;
            ans=(double)(v[cal]+v[cal2])/2;
        }
        return ans;
    }
};

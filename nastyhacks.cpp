#include <iostream>
using namespace std;
int main(){
   int n;
   int r,e,c;
   cin>>n; 
   for(int i=0;i<n;i++){
     cin>>r>>e>>c;
     if(e-c==r){
       cout<<"does not matter"<<endl;
     }
     else if(e-c>r){
       cout<<"advertise"<<endl;
     }
     else{
       cout<<"do not advertise"<<endl;
     }
   }
   
  }

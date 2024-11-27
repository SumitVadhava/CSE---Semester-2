import 'dart:io';

void main(){

  List<int> arrlist = [];

  for(int i = 0 ; i < 5 ; i++){
    print("Enter Number = ");
    int num = int.parse(stdin.readLineSync()!);

    arrlist.add(num);
  }
  print(arrlist);
}
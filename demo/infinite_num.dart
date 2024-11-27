import 'dart:io';

void main() {
  List<double> arrlist = [];

  while(true){
    print('Enter number (enter -1 for left) = ');
    double num = double.parse(stdin.readLineSync()!);

    if(num == -1) break;
    arrlist.add(num);
  }
  print(arrlist);
}
with open("info.txt","r")as file:
           for line in file :
                      #변수를 선언
                      (name, weight, height) = line.strip().split(",")

                      #데이터가 문제없는지 확인: 문제가 있으면 지나감
                      if (not name) or (not weight) or (not height):
                                 continue

                      #결과 계산
                      bmi = int(weight) / (int(height) * int(height))
                      result = ""
                      if 25 <= bmi:
                                 result = "과체중"
                      elif 18.5 <= bmi:
                                 result = "정상체중"
                      else:
                                 result = "저체중"

                      #출력
                      print('\n'.join([
                                 "이름: {}",
                                 "몸무게:{}",
                                 "키:{}",
                                 "BMI:{}",
                                 "결과:{}",
                      ]).format(name,weight,height,bmi,result))
                      print()

import random

def make_question():
        a = random.randint(1,40)                #1~ 40 사이의 임의의 수를 a에 저장
        b = random.randint(1,20)                #1~ 20 사이의 임의의 수를 b에 저장
        op = random.randint(1,4)                #1~ 3 사이의 임의의 수를 op에 저장

        #문자열 변수 q에 문제를 만듦
        #첫 번째 숫자 q에 저장
        q = str(a)                                      #a값(정수)를 문자열로 바꾸어 저장

        #연산자 추가
        if op == 1:                                     #op값이 1이면 덧셈문제
                q = q+"+"
        if op == 2:                                     #op값이 2이면 뺄셈문제
                q = q+"-"
        if op == 3:                                     #op값이 3이면 곱셈문제
                q = q+"*"
        if op == 4:
                q = q+"/"
                
        # 두 번째 숫자를 q에 저장
        q = q + str(b)                                  #b 값(정수)를 문자열로 바꾸어 q에 추가
        
        #만들어진 문제를 돌려줌
        return q
#정답/오답 횟수를 저장할 변수 sc1과 sc2를 0으로 초기화
sc1 = 0
sc2 = 0

for x in range (5):                                     #다섯 문제를 품
        q = make_question()                         #문제를 만듦
        print(q)                                           #문제를 출력
        ans = input("=")                               #사용자에게 정답을 입력받음
        r = int(ans)                                      #입력받은 정답을 정수로 바꿈

        #컴퓨터가 계산한 결과인 eval(q)의 값과 사용자가 입력한 결과(r)를 비교
        if eval(q) == r:
                print("정답")
                sc1 = sc1+1
        else:
                print("오답")
                sc2 = sc2+1

print ("정답 :" , sc1 , "오답 :", sc2)
if sc2 == 0:                                            #오답이 0개일때 (전부 정답일때)
        print ("당신은 천재")

import random
hanguls = list("지주정훈범석서윤혁경유")
#파일 쓰기 모드로 열기
with open ("info.txt","w")as file:
           for i in range(1000):
                      name = random.choice(hanguls) + random.choice(hanguls)
                      weight = random.randrange(40,100)
                      height = random.randrange(140,200)
                      #텍스트 쓰기
                      file.write("{},{},{}\n".format(name, weight, height))

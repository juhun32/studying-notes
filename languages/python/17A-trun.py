import turtle as t
import random

score = 0
playing =False

te = t.Turtle ()                # 악당 거북이
te.shape ("turtle")
te.color ("red")
te.speed (0)
te.up()
te.goto(0,200)

ts = t.Turtle()                 # 먹이
ts.shape ("circle")
ts.color ("green")
ts.speed(0)
ts.up()
ts.goto(0,-200)

tf = t.Turtle()                 # 먹이 2
tf.shape ("circle")
tf.color ("purple")
tf.speed(0)
tf.up()
tf.goto(0,-200)

def turn_right():               # 오른쪽으로 방향 바꾸기
        t.setheading(0)

def turn_up():                  # 위로 방향 바꾸기
        t.setheading(90)

def turn_left():                                 # 왼쪽으로 방향 바꾸기
        t.setheading(180)

def turn_down():                              # 아래로 방향 바꾸기
        t.setheading(270)       

def start():
        global playing
        if playing == False:
                playing = True
                t.clear()
                play()

def play ():                                            # 게임을 실제로 플레이
        global score
        global playing
        t.forward(10)                           # 주인공 거북이가 10만큼 앞으로 이동
        if random.randint(1,5) == 3:
                ang = te.towards(t.pos())
                te.setheading(ang)                    # 악당 거북이가 주인공 거북이를 바라보게 함
        speed = score + 3

        if speed > 15:
                speed = 15
        te.forward (speed)

        if t.distance(te) <12:

                text = "Score : " +str(score)
                message ("Game over", text)
                playing = False
                score = 0


        if t.distance(ts) < 12:                 #주인공과 먹이의 거리가 12보다 가까우면
                score = score + 1
                t.write(score)
                star_x = random.randint (-230,230)
                star_y = random.randint (-230,230)
                ts.goto(star_x, star_y)         #먹이를 다른곳에 옮김

        if t.distance(tf) < 12:
                score = score - 1
                t.write(score)
                star_a = random.randint (-230,230)
                star_b = random.randint (-230,230)
                tf.goto(star_a, star_b)

        if playing:
                t.ontimer(play, 100)

def message(m1,m2):
        t.clear()
        t.goto(0,100)
        t.write(m1,False,"center",("",20))
        t.goto(0,-100)
        t.write(m2,False,"center",("",15))
        t.home()

t.title ("Turtle Run")
t.setup(500,500)
t.bgcolor("blue")
t.shape("turtle")                               # 거북이 모양의 커서
t.speed(0)                                       #거북이 속도를 가장 빠르게 지정
t.up()
t.color("white")
t.onkeypress(turn_right, "Right")         #turn_right 함수 실행
t.onkeypress(turn_up, "Up")
t.onkeypress(turn_left, "Left")
t.onkeypress(turn_down,"Down")
t.onkeypress(start, "space")
t.listen()                                         #거북이 그래픽 창이 키보드 입력을 받게 함
message("Turtle Run", "[Space]")

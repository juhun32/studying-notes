import turtle as t
import random

def turn_up():
    t.left(2)

def turn_down():
    t.right(2)

def fire():
    ang = t.heading()
    while t.ycor() > 0 :
        t.forward(15)
        t.right(3)

    d = t.distance(target_2,0)
    e = t.distance(target_1,0)
    t.sety(random.randint(20,75))
    if d < 25 :
        t.color("purple")
        t.write("great!",False,"center",("",15))
        t.color("black")
        t.goto(-200,10)
        t.setheading(ang)

    elif e < 25 :
        t.color("blue")
        t.write("good!",False,"center",("",15))
        t.color("black")
        t.goto(-200,10)
        t.setheading(ang)

    else:
        t.color("red")
        t.write("Bad!",False,"center",("",14))
        t.color("black")
        t.goto(-200,10)
        t.setheading(ang)


t.goto(-300,0)
t.down()
t.goto(300,0)

target_1 = random.randint(40,140)
t.pensize(3)
t.color("green")
t.up()
t.goto(target_1 - 25,2)
t.down()
t.goto(target_1 + 25,2)

target_2 = random.randint(180,280)
t.pensize(3)
t.color("purple")
t.up()
t.goto(target_2 - 25,2)
t.down()
t.goto(target_2 + 25,2)

t.color("black")
t.up()
t.goto(-200,10)
t.setheading(20)

t.onkeypress(turn_up, "Up")
t.onkeypress(turn_down, "Down")
t.onkeypress(fire,"space")
t.listen()

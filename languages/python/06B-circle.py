import turtle as t

n = 50
t.bgcolor("gold")
t.color("yellow")
t.speed(0)
for x in range(n):
    t.circle(80)
    t.left(360 / n)
t.up()
t.goto(-200, 0)
t.down()

a = 50
t.color("red")
t.speed(0)
for x in range(a):
    t.circle(40)
    t.left(360 / a)

t.up()
t.goto(200, 0)
t.down()

b = 50
t.color("blue")
t.speed(0)
for x in range(b):
    t.circle(40)
    t.left(360 / b)

t.up()
t.goto(0, 200)
t.down()

c = 50
t.color("green")
t.speed(0)
for x in range(c):
    t.circle(40)
    t.left(360 / c)

t.up()
t.goto(0, -200)
t.down()

d = 50
t.color("purple")
t.speed(0)
for x in range(d):
    t.circle(40)
    t.left(360 / d)

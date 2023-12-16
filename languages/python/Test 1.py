# # print(int(input())-543) 
# # not solved

# a, b ,c = [int(x) for x in input().split()]
# print((a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c, sep='\n')

# num1 = int(input())
# num2 = int(input())

# # spl=sum(map(int, str(num1)))
# splnum2 = []
# for i in str(num2):
#     splnum2.append(i)

# for i in reversed(range(3)):
#     print(num1*int(splnum2[i]))
# print(num1*num2)

# a, b = [int(x) for x in input().split()]
# if a > b:
#     print(">")
# elif a < b:
#     print("<")
# else:
#     print("=")

# score = int(input())
# if score >= 90:
#     print("A")
# elif score >= 80 and score < 90:
#     print("B")
# elif score < 80 and score >= 70:
#     print("C")
# elif score < 70 and score >= 60:
#     print("D")
# else:
#     print("F")

# year = int(input())
# if year%4 == 0:
#     if year%100 != 0 or year%400 == 0 :
#         print("1")
#     elif year%400 != 0:
#         print("0")
# else:
#     print("0")

# x = int(input())
# y = int(input())
# if x > 0 and y > 0:
#     print("1")
# elif x > 0 and y < 0:
#     print("4")
# elif x < 0 and y > 0:
#     print("2")
# elif x < 0 and y < 0:
#     print("3")

# t, m = [int(x) for x in input().split()]
# if t > 0:
#     if m >= 45:
#         m = m-45
#         print(t, m)
#     elif m < 45:
#         t = t-1
#         m = m+60
#         print(t, m-45)
# elif t == 0:
#     if m >= 45:
#         m = m-45
#         print(t, m)
#     elif m < 45:
#         m = m+60
#         t = 23
#         print(t, m-45)

# or

# H, M = map(int, input().split())
# if M < 45 :
#     if H == 0 :
#         H = 23
#         M += 60
#     else :
#         H -= 1	
#         M += 60
# print(H, M-45)

# h, m = map(int, input().split())
# add = int(input())
# m += add
# H = h + m//60
# if H >= 24:
#     print(H-24, m%60)
# else:
#     print(H, m%60)

# a, b, c = map(int, input().split())
# l = [a,b,c]
# sortl = sorted(l)
# if sortl[0] == sortl[1] and sortl[0] != sortl[2]:
#     print(1000+sortl[0]*100)
# elif sortl[2] == sortl[1] and sortl[0] != sortl[2]:
#     print(1000+sortl[2]*100)
# elif sortl[0] == sortl[1] == sortl [2]:
#     print(10000+sortl[0]*1000)
# elif sortl[0] != sortl[1] != sortl[2]:
#     print(100*sortl[2])

import sys
from PyQt5.QtWidgets import QApplication, QWidget, QPushButton, QHBoxLayout, QVBoxLayout


class MyApp(QWidget):

    def __init__(self):
        super().__init__()
        self.initUI()

    def initUI(self):
        okButton = QPushButton('OK')
        cancelButton = QPushButton('Cancel')

        hbox = QHBoxLayout()
        hbox.addStretch(1)
        hbox.addWidget(okButton)
        hbox.addWidget(cancelButton)
        hbox.addStretch(1)

        vbox = QVBoxLayout()
        vbox.addStretch(3)
        vbox.addLayout(hbox)
        vbox.addStretch(1)

        self.setLayout(vbox)

        self.setWindowTitle('Box Layout')
        self.setGeometry(300, 300, 300, 200)
        self.show()


if __name__ == '__main__':
    app = QApplication(sys.argv)
    ex = MyApp()
    sys.exit(app.exec_())
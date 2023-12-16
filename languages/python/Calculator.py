import sys
from PyQt5.QtWidgets import QApplication, QWidget, QDesktopWidget, QPushButton, QVBoxLayout
from PyQt5.QtGui import QIcon



class MyApp(QWidget):

    def __init__(self):
        super().__init__()
        self.initUI()

    def initUI(self):
        # btn1 = QPushButton('&Button1', self)
        # btn1.setCheckable(True)
        # btn1.toggle()

        btn1 = QPushButton(self)
        btn1.setText('Button&1')

        btn2 = QPushButton(self)
        btn2.setText('Button&2')

        btn3 = QPushButton(self)
        btn3.setText('Button&3')

        hbox = QVBoxLayout()
        hbox.addStretch(1)
        hbox.addWidget(btn1) 
        hbox.addWidget(btn2)
        hbox.addWidget(btn3)
        hbox.addStretch(1)

        vbox = QVBoxLayout()
        vbox.addStretch(3)
        vbox.addLayout(hbox)
        vbox.addStretch(3)

        self.setLayout(vbox)

        self.setWindowTitle('Calculator v1.1')
        self.setWindowIcon(QIcon('/Users/King/Desktop/Project 1/Calculator/calc.png'))
        self.setGeometry(300, 300, 300, 500)
        self.center()
        self.show()

    def center(self):
        qr = self.frameGeometry()
        cp = QDesktopWidget().availableGeometry().center()
        qr.moveCenter(cp)
        self.move(qr.topLeft())

if __name__ == '__main__':
   app = QApplication(sys.argv)
   ex = MyApp()
   sys.exit(app.exec_())
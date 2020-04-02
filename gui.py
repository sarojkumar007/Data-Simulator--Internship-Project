#!/usr/bin/python3
import tkinter as tk
# from pynput.mouse import Button, Controller
from time import sleep

def motion(event):
    print("Mouse position: (%s, %s)" % (event.x, event.y))
    sleep(0.5)
    return False

width = input("Enter Width in pixel unit:\n")
height = input("Enter Height in pixel unit:\n")
win = tk.Tk()

win.title('Data Simmulator')
head = tk.Label(win,text="Hover over the Box",font=("Ubuntu",30,'bold'),fg='#1a237e',bg='#5c6bc0', pady=20,padx=20)
head.pack(fill=tk.X)
#frame
frame = tk.Frame(win,width=width,height=height,relief='groove', cursor='dot',borderwidth=3)
frame.bind('<Motion>',motion)
frame.pack()
frame.pack_propagate(0)
# #Button
# btn = tk.Button(win,text="SUBMIT",activebackground='#ff5252',activeforeground='#fff',bg='#fff',fg='#ff5252')
# btn.pack()

win.mainloop()

# mouse = Controller()
# while True:
#     print(mouse.position)

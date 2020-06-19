import simplegui

time = 0
succ = 0
attmpts = 0


def format(t):
    A = str(time / 600)
    B = str((time % 600) / 100)
    C = str((time % 100) / 10)
    D = str((time % 10))
    return A + ':' + B + C + '.' + D


def start_handler():
    timer.start()


def stop_handler():
    global succ, attmpts
    if timer.is_running():
        attmpts += 1
        if time % 10 == 0:
            succ += 1
    timer.stop()


def reset_handler():
    timer.stop()
    global time, succ, attmpts
    time = 0
    succ = 0
    attmpts = 0


def timer_handler():
    global time
    time += 1


def draw_handler(canvas):
    canvas.draw_text(format(time), (120, 120), 50, 'white')
    canvas.draw_text((str(succ) + '/' + str(attmpts)), (290, 50), 30, 'red')


frame = simplegui.create_frame('Stopwatch: The Game', 360, 220)
timer = simplegui.create_timer(100, timer_handler)


frame.set_draw_handler(draw_handler)
frame.add_button('Start', start_handler, 80)
frame.add_button('Stop', stop_handler, 80)
frame.add_button('Reset', reset_handler, 80)


frame.start()


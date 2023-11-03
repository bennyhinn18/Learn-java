import tkinter as tk
import time

# Create a tkinter window
root = tk.Tk()
root.title("Clock")

# Create a label to display the time
time_label = tk.Label(root, font=("Arial", 80))
time_label.pack()

# Define a function to update the time label every second
def update_time():
    current_time = time.strftime("%H:%M:%S")
    time_label.config(text=current_time)
    time_label.after(1000, update_time)

# Call the function to start the clock
update_time()

# Start the tkinter event loop
root.mainloop()

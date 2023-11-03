# Use an existing base image with a minimal Linux distribution
FROM ubuntu:latest

# Install necessary packages for GUI
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
    xfce4 \
    xfce4-terminal \
    firefox
    

# Set the default command to start the GUI
CMD startxfce4

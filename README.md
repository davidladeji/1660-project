# 1660-project

Steps to run docker images in Kubernetes (Checkpoint)

1. Find all docker images
2. Test to see if these images can be used
3. Build docker containers from the images
4. Use yaml generator to create yaml file to deploy these containers
5. Install Kubernetes on Docker desktop
6. Deploy the containers using the yaml file from the terminal



To run this project

1. Pull the driver image from docker hub. (docker pull dladeji2/project-driver)
2. Run this image in a container with the -i (interactive) tag
3. Use the application and paste any URL that is presented as a result from user's choice of application to run


Things to note about my project

1. Though I did deploy the driver code to the Kubernetes cluster, I ran into some issues with getting it to be error free
2. Since this is a terminal app, I assumed you'd need to pull the image to run this code, however the Kubernetes cluster needs to be running while the application is being used
3. The application's Spark and Hadoop urls lead to masters that can't detect their workers. There are worker node services for each but the master's can't connect to them or vice-versa
4. The Jupyter notebook option of the application, sends you to a URL requesting for a token by Jupyter. However, there's no way to get to the notebook application from this point
This is because I couldn't figure out the right enviroment variable to pass into the workload. I tried a token but since there can be no predefined token, this doesn't work
5. The sonarQube application doesn't have sonarscanner contained in it as I couldn't make an image that'll include the sonarscanner property

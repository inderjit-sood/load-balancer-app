#Compile the java project
javac -cp . com/loadbalancer/models/*.java com/loadbalancer/models/interfaces/*.java com/loadbalancer/services/*.java com/loadbalancer/LoadBalancerApp.java

#Run the java app
java com.loadbalancer.LoadBalancerApp

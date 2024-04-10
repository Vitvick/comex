apiVersion: v1
kind: Pod
metadata:
name: apispring
labels:
app: api-pod
spec:
containers:
        - name: apispring
image: leosouzadev1/springapi:latest
      # image: springapi
      # imagePullPolicy: Never
ports:
        - containerPort: 8080
env:
        - name: MYSQL_HOST
value: "svc-bd"
        - name: MYSQL_DATABASE
value: "db_farmacia"
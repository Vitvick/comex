apiVersion: v1
kind: Service
metadata:
name: svc-api
spec:
type: NodePort
selector:
app: api-pod
ports:
        - port: 8080
nodePort: 30000
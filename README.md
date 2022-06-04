# demo-service

Getting K8S and Helm

Tools:

- [KIND](https://kind.sigs.k8s.io/)

### Creating image

```bash
    docker build -t demo .
```

### Creating cluster K8S

```bash
    kind create cluster --config=k8s/kind.yaml --name=demo
```

### Creating POD

```bash
    kubectl apply -f k8s/pod.yaml
```

### Accessing demo-service

```bash
    kubectl port-forward pod/demo-service 8080:8080
```

[Testing here...](http://localhost:8080/apps?name=java) 
(function () {
        var ws = new WebSocket("ws://localhost:8080/kickoff");
        ws.onmessage = function (ev) {
            if (Notification.permission = "granted") {
                var notification = new Notification(ev.data);
            } else {
                if (Notification.permission !== 'denied') {
                    Notification.requestPermission(
                        function (permission) {
                            // 如果用户同意，就可以向他们发送通知
                            if (permission === "granted") {
                                var notification = new Notification(ev.data);
                            }
                        })
                }
            }
            ws.close();
            window.location.reload();
        }
        ws.onopen = function () {
            console.log("websocket is opened")
        }
    }
)();
### update permissions
sudo chmod 755 /etc/X11/xinit/xinitrc

sudo chmod -R 755 /usr/share/fonts
[linux forum](http://www.linuxforums.org/forum/ubuntu-linux/93755-stating-xfce-vnc-scession.html)

### start vncserver
`vncserver -kill :1;  vncserver -depth 24 -geometry 1280x1024; sleep 5; cat ~/.vnc/*\:1.log`


### Info
* vnc seesions will use local settings, so it's not possible tu run xfce and gnome based session in parallel

### Port-Range
10.000 - 10.1000 für OpenStack freigegeben.


### CentOs
* Centos6: dbus id `/bin/dbus-uuidgen > /var/lib/dbus/machine-id`
* Centos7: dbus id `/bin/dbus-uuidgen > /etc/machine-id`

### build and start
* Centos7: 
  `docker build -t toschneck/centos-xfce-vnc . && docker run -d -p 5911:5901 toschneck/centos-xfce-vnc`
* Ubuntu:
  `docker build -t toschneck/ubuntu-xfce-vnc . && docker run -d -p 5912:5901 toschneck/ubuntu-xfce-vnc`

### update /etc/hosts 

To prevent gearman/mysql connections to run in timeouts: 

    docker run --add-host vbsakulidemo:192.168.122.35 ...

This updates /etc/hosts with 

    192.168.122.35  vbsakulidemo

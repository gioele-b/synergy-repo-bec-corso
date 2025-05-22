#!/bin/bash

################################
# PATH SORGENTE (TOMCAT)       #
################################
#e.g. srcPath=/dev/tomcat-delta/webapps
srcPath=/dev/tomcat-delta/webapps
################################
# PATH TARGET (REPOSITORY)     #
################################
#e.g. trgPath=/workspace-shared/webProjects
trgPath=/workspace-shared/webProjects
################################
# LISTA CARTELLE DA LINKARE    #
################################

modules[0]=/jpm
modules[1]=/synergy
modules[2]=/jpm-share
modules[3]=/digital-industry
modules[4]=/info
modules[5]=/jmes
modules[6]=/jmes-diaope
modules[7]=/synergy-common
modules[8]=/synergy-config
modules[9]=/synergy-doc
modules[10]=/cal
modules[11]=/synergy-user
modules[12]=/synergy-wzd
modules[13]=/sinottico
modules[14]=/synergy-doc-ng
modules[15]=/synergy-data-viz
modules[16]=/sfm
modules[17]=/synergy-old
modules[18]=/synergy-data-viz-old

for m in ${modules[*]}
do
    SOURCE=$srcPath$m
    TARGET=$trgPath$m
    if [ -e "$SOURCE" ];
    then
        echo "Il file $SOURCE esiste già"
    else
        echo "creazione link $SOURCE -> $TARGET"
        ln -s $TARGET $SOURCE
    fi
done
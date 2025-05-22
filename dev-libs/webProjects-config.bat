@echo off
::::::::::::::::::::::::::::::::::::::::::
::: PATH SORGENTE (TOMCAT) :::::::::::::::
::::::::::::::::::::::::::::::::::::::::::
set srcPath=C:\Devel\tomcat\webapps
::::::::::::::::::::::::::::::::::::::::::
::: PATH TARGET (REPOSITORY) :::::::::::::
::::::::::::::::::::::::::::::::::::::::::
set trgPath=C:\Devel\git\synergy-main\webProjects
::::::::::::::::::::::::::::::::::::::::::
::: LISTA DELLE CARTELLE DA LINKARE ::::::
::::::::::::::::::::::::::::::::::::::::::
set modules[0]=\jpm
set modules[1]=\synergy
set modules[2]=\jpm-share
set modules[3]=\digital-industry
set modules[4]=\info
set modules[5]=\jmes
set modules[6]=\jmes-diaope
set modules[7]=\synergy-common
set modules[8]=\synergy-config
set modules[9]=\synergy-doc
set modules[10]=\cal
set modules[11]=\synergy-user
set modules[12]=\synergy-wzd
set modules[13]=\sinottico
set modules[14]=\synergy-doc-ng
set modules[15]=\synergy-data-viz
set modules[16]=\sfm
set modules[17]=\synergy-old
set modules[18]=\synergy-data-viz-old

for /F "tokens=2 delims==" %%s in ('set modules[') do (
    if exist %srcPath%%%s (
        echo Esiste gia il riferimento verso [%trgPath%%%s]
    ) else (
        echo Creo il link verso [%trgPath%%%s]
        mklink /D %srcPath%%%s %trgPath%%%s
    )
)
pause

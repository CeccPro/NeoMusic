cmake_minimum_required(VERSION 3.22.1)

project("neomusic")

add_library(
        neomusic
        SHARED
        native-lib.cpp)

find_library(
        log-lib
        log)

target_link_libraries(
        neomusic
        ${log-lib})

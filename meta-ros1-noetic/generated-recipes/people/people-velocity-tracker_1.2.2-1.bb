# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Track the output of the leg_detector to indicate the velocity of person."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/people_velocity_tracker"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "people_velocity_tracker"

ROS_BUILD_DEPENDS = " \
    easy-markers \
    geometry-msgs \
    kalman-filter \
    people-msgs \
    roslib \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    easy-markers \
    geometry-msgs \
    kalman-filter \
    people-msgs \
    roslib \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    easy-markers \
    geometry-msgs \
    kalman-filter \
    people-msgs \
    roslib \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OSUrobotics/people-release/archive/release/noetic/people_velocity_tracker/1.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/people_velocity_tracker"
SRC_URI = "git://github.com/OSUrobotics/people-release;${ROS_BRANCH};protocol=https"
SRCREV = "e0adde448a05a3381c1337461b46ec28be40769a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Python bindings for EXOTica"
AUTHOR = "Wolfgang Merkt <wolfgang@robots.ox.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_python"

ROS_BUILD_DEPENDS = " \
    exotica-core \
    geometry-msgs \
    moveit-msgs \
    pybind11-catkin \
    shape-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    exotica-core \
    geometry-msgs \
    moveit-msgs \
    pybind11-catkin \
    shape-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-pyassimp} \
    exotica-core \
    geometry-msgs \
    moveit-msgs \
    pybind11-catkin \
    python3-matplotlib \
    python3-rospkg \
    python3-tkinter \
    shape-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/noetic/exotica_python/6.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/exotica_python"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "f4c221d992927f8a5a571f7871bcd83dcfbfe2b4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

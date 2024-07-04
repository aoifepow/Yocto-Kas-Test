DESCRIPTION = "Hello World from scratch"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://hello.c"

TARGET_CC_ARCH += "${LDFLAGS}"

S="${WORKDIR}"

do_compile() {
	${CXX} hello.c -o hello

do_install() {
	install -d -m 0755 ${D}${bindir}
	install -m 0755 ${S}/hello ${D}${bindir}/
}

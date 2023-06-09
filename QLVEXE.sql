USE [QLVEXE]
GO
/****** Object:  Table [dbo].[ChuyenXe]    Script Date: 09/05/2022 21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuyenXe](
	[MaChuyen] [int] IDENTITY(1,1) NOT NULL,
	[MaTuyen] [int] NOT NULL,
	[NgayDi] [date] NOT NULL,
	[GioDi] [time](4) NOT NULL,
	[GiaVe] [int] NOT NULL,
	[TrangThai] [nvarchar](50) NULL,
 CONSTRAINT [PK_ChuyenXe] PRIMARY KEY CLUSTERED 
(
	[MaChuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 09/05/2022 21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[TenKH] [nvarchar](200) NOT NULL,
	[Sdt] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 09/05/2022 21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [int] IDENTITY(1,1) NOT NULL,
	[TenNV] [nvarchar](200) NOT NULL,
	[Sdt] [nchar](10) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[PhanQuyen] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TuyenXe]    Script Date: 09/05/2022 21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TuyenXe](
	[MaTuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenTuyen] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_TuyenXe] PRIMARY KEY CLUSTERED 
(
	[MaTuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VeXe]    Script Date: 09/05/2022 21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VeXe](
	[MaVe] [int] IDENTITY(1,1) NOT NULL,
	[MaChuyen] [int] NOT NULL,
	[MaKH] [int] NOT NULL,
	[MaNV] [int] NOT NULL,
	[MaSoGhe] [nchar](10) NOT NULL,
	[ThoiGianDat] [date] NOT NULL,
	[TongTien] [int] NOT NULL,
 CONSTRAINT [PK_VeXe] PRIMARY KEY CLUSTERED 
(
	[MaVe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[ChuyenXe] ON 

INSERT [dbo].[ChuyenXe] ([MaChuyen], [MaTuyen], [NgayDi], [GioDi], [GiaVe], [TrangThai]) VALUES (1, 1, CAST(N'2021-12-27' AS Date), CAST(N'17:00:00' AS Time), 500000, NULL)
INSERT [dbo].[ChuyenXe] ([MaChuyen], [MaTuyen], [NgayDi], [GioDi], [GiaVe], [TrangThai]) VALUES (9, 1, CAST(N'2022-06-07' AS Date), CAST(N'16:40:00' AS Time), 200000, NULL)
INSERT [dbo].[ChuyenXe] ([MaChuyen], [MaTuyen], [NgayDi], [GioDi], [GiaVe], [TrangThai]) VALUES (12, 2, CAST(N'2022-06-14' AS Date), CAST(N'13:00:00' AS Time), 450000, NULL)
INSERT [dbo].[ChuyenXe] ([MaChuyen], [MaTuyen], [NgayDi], [GioDi], [GiaVe], [TrangThai]) VALUES (13, 4, CAST(N'2022-07-15' AS Date), CAST(N'09:00:00' AS Time), 500000, NULL)
INSERT [dbo].[ChuyenXe] ([MaChuyen], [MaTuyen], [NgayDi], [GioDi], [GiaVe], [TrangThai]) VALUES (15, 3, CAST(N'2022-06-19' AS Date), CAST(N'11:00:00' AS Time), 300000, NULL)
SET IDENTITY_INSERT [dbo].[ChuyenXe] OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Sdt], [NgaySinh]) VALUES (1, N'Nguyễn Thị Thắm', N'0356235652', CAST(N'2000-02-04' AS Date))
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Sdt], [NgaySinh]) VALUES (2, N'Võ Khải', N'0345623562', CAST(N'1999-12-31' AS Date))
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [Sdt], [NgaySinh], [PhanQuyen]) VALUES (1, N'Nguyễn khánh tuấn', N'0383981852', CAST(N'2001-09-17' AS Date), NULL)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [Sdt], [NgaySinh], [PhanQuyen]) VALUES (2, N'Nguyễn hữu khánh', N'0344266646', CAST(N'2001-01-07' AS Date), NULL)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [Sdt], [NgaySinh], [PhanQuyen]) VALUES (3, N'Lâm hữu vinh', N'0343297542', CAST(N'2001-12-01' AS Date), NULL)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [Sdt], [NgaySinh], [PhanQuyen]) VALUES (4, N'Nguyễn Thị Thúy', N'0123456789', CAST(N'2001-12-03' AS Date), NULL)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [Sdt], [NgaySinh], [PhanQuyen]) VALUES (10, N'admin', N'1         ', CAST(N'2001-12-03' AS Date), N'admin')
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[TuyenXe] ON 

INSERT [dbo].[TuyenXe] ([MaTuyen], [TenTuyen]) VALUES (1, N'Bến Tre - Hà Nội')
INSERT [dbo].[TuyenXe] ([MaTuyen], [TenTuyen]) VALUES (2, N'TPHCM - Hà Nội')
INSERT [dbo].[TuyenXe] ([MaTuyen], [TenTuyen]) VALUES (3, N'TPHCM - Đà Nẵng')
INSERT [dbo].[TuyenXe] ([MaTuyen], [TenTuyen]) VALUES (4, N'Đà Nẵng - Đắk Lắk')
SET IDENTITY_INSERT [dbo].[TuyenXe] OFF
GO
ALTER TABLE [dbo].[ChuyenXe]  WITH CHECK ADD  CONSTRAINT [FK_ChuyenXe_TuyenXe] FOREIGN KEY([MaTuyen])
REFERENCES [dbo].[TuyenXe] ([MaTuyen])
GO
ALTER TABLE [dbo].[ChuyenXe] CHECK CONSTRAINT [FK_ChuyenXe_TuyenXe]
GO
ALTER TABLE [dbo].[VeXe]  WITH CHECK ADD  CONSTRAINT [FK_VeXe_ChuyenXe] FOREIGN KEY([MaChuyen])
REFERENCES [dbo].[ChuyenXe] ([MaChuyen])
GO
ALTER TABLE [dbo].[VeXe] CHECK CONSTRAINT [FK_VeXe_ChuyenXe]
GO
ALTER TABLE [dbo].[VeXe]  WITH CHECK ADD  CONSTRAINT [FK_VeXe_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[VeXe] CHECK CONSTRAINT [FK_VeXe_KhachHang]
GO
ALTER TABLE [dbo].[VeXe]  WITH CHECK ADD  CONSTRAINT [FK_VeXe_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[VeXe] CHECK CONSTRAINT [FK_VeXe_NhanVien]
GO
